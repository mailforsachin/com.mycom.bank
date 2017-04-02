freeStyleJob('example') {
    
    scm {
        git('https://github.com/sumeshkanayi/com.mycom.bank.git', 'master')
    }
  
    steps {
        steps {
        shell('python test.py')
    }
    }
   
}
