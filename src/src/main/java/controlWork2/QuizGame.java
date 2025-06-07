package controlWork2;

import java.io.*;
import java.util.Collections;
import java.util.Scanner;

public class QuizGame {
    private static final String QUESTIONS_FILE = "questions.dat";
    private static final String RAITING_FILE = "raiting.dat";

    private Questions questions;
    private Raiting raiting;

    public QuizGame() {
        loadQuestions();
        loadRaiting();
    }

    private void loadQuestions() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(QUESTIONS_FILE))) {
            questions = (Questions) ois.readObject();
        } catch (FileNotFoundException e) {
            createDefaultQuestions();
            saveQuestions();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void createDefaultQuestions() {
        questions = new Questions();


        questions.question1 = "Когда экзамен по алгему?";
        questions.response1 = new String[]{"7 июня", "32 декабря", "27 июня"};
        questions.goodResponseIndex1 = 2;


        questions.question2 = "Как зовут Корнееву?";
        questions.response2 = new String[]{"Марат", "Наталья", "Привет"};
        questions.goodResponseIndex2 = 1;


        questions.question3 = "Сколько человек в группе 11-403";
        questions.response3 = new String[]{"0", "100", "28"};
        questions.goodResponseIndex3 = 2;
    }

    private void saveQuestions() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(QUESTIONS_FILE))) {
            oos.writeObject(questions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadRaiting() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RAITING_FILE))) {
            raiting = (Raiting) ois.readObject();
        } catch (FileNotFoundException e) {
            raiting = new Raiting();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveRaiting() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RAITING_FILE))) {
            oos.writeObject(raiting);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в викторину!");
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        int score = 0;

        System.out.println("\nВопрос 1: " + questions.question1);
        for (int i = 0; i < questions.response1.length; i++) {
            System.out.println((i + 1) + ". " + questions.response1[i]);
        }
        System.out.print("Ваш ответ от 1 до 3: ");
        int answer1 = scanner.nextInt() - 1;
        if (answer1 == questions.goodResponseIndex1) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно!");
        }


        System.out.println("\nВопрос 2: " + questions.question2);
        for (int i = 0; i < questions.response2.length; i++) {
            System.out.println((i + 1) + ". " + questions.response2[i]);
        }
        System.out.print("Ваш ответ от 1 до 3: ");
        int answer2 = scanner.nextInt() - 1;
        if (answer2 == questions.goodResponseIndex2) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно!");
        }


        System.out.println("\nВопрос 3: " + questions.question3);
        for (int i = 0; i < questions.response3.length; i++) {
            System.out.println((i + 1) + ". " + questions.response3[i]);
        }
        System.out.print("Ваш ответ от 1 до 3: ");
        int answer3 = scanner.nextInt() - 1;
        if (answer3 == questions.goodResponseIndex3) {
            score++;
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно!");
        }


        System.out.println("\n" + name + ", ваш результат: " + score + " из 3");

        raiting.games.add(new Game(name, score));
        Collections.sort(raiting.games);
        saveRaiting();

        System.out.println("\nИстория игр (по рейтингу):");
        System.out.println("---------------------------");
        System.out.printf("%-20s %-10s %-20s\n", "Игрок", "Очки", "Дата");
        for (Game game : raiting.games) {
            System.out.printf("%-20s %-10d %-20s\n",
                    game.gamer,
                    game.raiting,
                    game.gameDate.toString());
        }
    }
}
