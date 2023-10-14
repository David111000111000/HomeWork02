package org.example.commands;

public class BotCommonCommands {
    @AppBotCommand(name = "/hello", description = "when request hello", showInHelp = true)
    String hello(){
        return "Шалом";
    }

    @AppBotCommand(name = "/bye", description = "when request bye", showInHelp = true)
    String bye(){
        return "Сайонара";
    }

    @AppBotCommand(name = "/help", description = "when request help", showInKeyboard = true)
    String help(){
        return "Помоги себе сам.";
    }
}
