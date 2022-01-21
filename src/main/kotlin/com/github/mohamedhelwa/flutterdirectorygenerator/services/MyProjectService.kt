package com.github.mohamedhelwa.flutterdirectorygenerator.services

import com.intellij.openapi.project.Project
import com.github.mohamedhelwa.flutterdirectorygenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
