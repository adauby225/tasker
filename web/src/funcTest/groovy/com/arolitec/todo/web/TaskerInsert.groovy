package com.arolitec.todo.web;

import geb.*

class TaskerInsert extends Page {
    static url = "http://localhost:8080/web/insert"
    static at = { title == "Tasker application" }
}