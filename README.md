# Telegram Bot

Please refer to the [wiki](https://github.com/shafdanny/Telegram-Bot/wiki) for more detailed information.

[![Build Status](http://localhost:8080/job/Telegram%20Bot%20Java/badge/icon)](http://localhost:8080/job/Telegram%20Bot%20Java/)

## About
This is a framework for Java, designed to help minimise the coding needed for the communication with Telegram server.
The developer of bot can focus on programming the bot.

## Getting started

What you need:
- Java 1.8
- Maven

## Creating a bot

### API key
Open a Telegram application and search for [BotFather](https://telegram.me/botfather). Ask him to give you an API key for a bot.
Once you get the key, open the file `config.sample.properties` and put your API key. Rename the file to `config.properties`

### Define a bot
A bot can be defined by inheriting the abstract class `TelegramBot`.

## Example
To launch an example bot, use Maven as following:

`mvn exec:java -Dexec.mainClass="example.EXAMPLE_BOT_NAME"`   
 
