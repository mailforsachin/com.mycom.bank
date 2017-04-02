freeStyleJob('example') {
    
    scm {
        github('https://github.com/sumeshkanayi/com.mycom.bank.git', 'master')
    }
  
    steps {
        steps {
        shell('python test.py')
    }
    }
   
}
