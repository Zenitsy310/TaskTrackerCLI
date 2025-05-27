package com.main;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "my-cli-app", // Имя, по которому будут вызывать твою программу
mixinStandardHelpOptions = true, // Автоматически добавляет --help и --version
version = "My CLI App 1.0",
description = "Моё крутое CLI-приложение делает разные штуки.")
public class Main implements Runnable {
	 // 3. Объяви опции (то, что с тире, например --verbose или -f)
    @Option(names = {"-v", "--verbose"}, description = "Включить подробный вывод.")
    private boolean verbose = false; // Значение по умолчанию

    @Option(names = {"-u", "--user"}, description = "Имя пользователя.")
    private String userName; // Picocli заполнит это из командной строки

    // 4. Объяви позиционные параметры (то, что без тире, идёт по порядку)
    @Parameters(index = "0", description = "Имя файла для обработки.", arity = "0..1") // arity="0..1" значит, что параметр не обязателен
    private String inputFile;

    // 5. Это твой главный метод, как в обычном Java-приложении
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Создаём объект CommandLine, передаём ему экземпляр нашего класса (команды)
        // и аргументы из командной строки (args).
        // execute() запускает всю магию Picocli и в итоге вызывает наш метод run()
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode); // Выходим с кодом, который вернул Picocli
    }

    // 6. Этот метод Picocli вызовет после того, как распарсит аргументы
    @Override
    public void run() {
        System.out.println("Привет из моего CLI-приложения!");

        if (userName != null) {
            System.out.println("Пользователь: " + userName);
        }

        if (inputFile != null) {
            System.out.println("Будем обрабатывать файл: " + inputFile);
        } else {
            System.out.println("Файл для обработки не указан.");
        }

        if (verbose) {
            System.out.println("Включен подробный режим.");
        }

        // Здесь будет основная логика твоего приложения
        // Например, вызываешь другие классы (сервисы), чтобы что-то сделать
    }
}