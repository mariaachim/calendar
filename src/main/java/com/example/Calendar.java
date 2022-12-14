package com.example;
import com.example.DBConnection;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.*;

@Command(name = "calendar", mixinStandardHelpOptions = true, version = "calendar 1.0", description = "CLI events calendar")

public class Calendar implements Runnable {
    @Option(names = {"-a", "--add"}, description = "Add event")
    boolean add;

    @Option(names = {"-r", "--remove"}, description = "Remove event")
    boolean remove;

    @Parameters(index = "0", paramLabel = "<date>", description = "Date of event to add")
    private String dateStr;

    @Override
    public void run() {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("d/M/yyyy");

        LocalDate date = LocalDate.parse(dateStr, formatDate);
        DayOfWeek day = DayOfWeek.from(date);
        System.out.println(date + " is a " + day);

    }
    public static void main(String... args) {
        int exitCode = new CommandLine(new Calendar()).execute(args);
        System.exit(exitCode);
    }
}