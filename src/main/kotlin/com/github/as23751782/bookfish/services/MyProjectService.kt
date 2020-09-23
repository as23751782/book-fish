package com.github.as23751782.bookfish.services

import com.intellij.openapi.project.Project
import com.github.as23751782.bookfish.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
