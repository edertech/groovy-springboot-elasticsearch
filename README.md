# Groovy SpringBoot Elasticsearch
This sample project demonstrates how to build and deploy a Groovy Spring Boot application to access Elasticsearch.

## Goal
Build a very simple web application with [Spring Boot](http://projects.spring.io/spring-boot/) and [Groovy](http://www.groovy-lang.org) to demonstrate how to access domain-specific data (for the propose of this sample: songs) from Elasticsearch.

## Software Requirements

### Elasticsearch Server

*  [Download and setup Elasticsearch server](https://www.elastic.co/guide/en/elasticsearch/reference/current/setup.html).

### Rest Client

* You can use any rest client but i suggest [HTTPie Command line HTTP client](http://httpie.org).

### Gradle

To compile and start the application you require a Java Development Kit (JDK8) as well as [Gradle](http://www.gradle.org/).

## Try it out

* Start [Elasticsearch](https://www.elastic.co/guide/en/elasticsearch/reference/current/setup-service.html).

First you need to populate some **Songs** in Elasticsearch. Let's do it by command line:

    http PUT localhost:9200/music/songs/1 id=1 name=Frequency year=1992 artist="Alter 8" 

    http PUT localhost:9200/music/songs/2 id=2 name="Charly (Original Mix)" year=1991 artist="The Prodigy"

    http PUT localhost:9200/music/songs/3 id=3 name="Jericho" year=1992 artist="The Prodigy"

    http PUT localhost:9200/music/songs/4 id=4 name="LFO" year=1992 artist="LFO"

Start Application

    gradle bootRun

NOTE: If you want to open the sources with your favorite IDE, you might want to generate project files for Eclipse or IntelliJ IDEA with:

    gradle eclipse
    gradle idea

Or you can just open the source with Sublime Text Editor.

### Interact with the REST endpoints

#### Retrieve all Songs

    http localhost:8080/sample/songs 

## TODO

* Create a complete CRUD endpoints