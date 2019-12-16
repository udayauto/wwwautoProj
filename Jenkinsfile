node
{   
	stage ('Git Checkout') {
        git 'https://github.com/udayauto/wwwautoProj'
		}
	
	stage ('compile project') {
	def mvnhome = tool name: 'MAVEN_HOME', type: 'maven'
		sh "${mvnhome}/bin/mvn package"
		
	}
}

