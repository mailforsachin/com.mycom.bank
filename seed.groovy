freeStyleJob('example') {
    
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
    }
  
    steps {
        steps {
        shell('python test.py')
    }
    }
   
}
