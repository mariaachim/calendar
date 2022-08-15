package com.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */

@Command(name = "calendar", mixinStandardHelpOptions = true, version = "calendar 1.0", description = "CLI events calendar")

public class Calendar {
    @Parameters(index = "0", description = "Date of event to add")
    private LocalDate date;
    public static void main(String... args)
    {
        System.out.println( "Hello World!" );
        int exitCode = new CommandLine(new Calendar()).execute(args));
        System.exit(exitCode);
    }
}
