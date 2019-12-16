node
{   
	stage ('Git Checkout') {
        git 'https://github.com/udayauto/wwwautoProj'
		}
	
	stage ('compile project') {
		
	sh 'mvn package'
		
	}

   stage('Email Notification'){
		mail bcc: '', body: """Hi Team, You build successfully deployed
		                       Job URL : ${env.JOB_URL}
							   Job Name: ${env.JOB_NAME}

Thanks,
DevOps Team""", cc: '', from: '', replyTo: '', subject: "${env.JOB_NAME} Success", to: 'uday.kirun@gmail.com'
   
   }
}

