package com.github.zalrjcher.devflow.services

import com.intellij.openapi.project.Project
import com.github.zalrjcher.devflow.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
