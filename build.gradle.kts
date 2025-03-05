plugins {
   id("us.ihmc.ihmc-build")
}

ihmc {
   group = "us.ihmc"
   version = "1.0.1"
   vcsUrl = "https://github.com/ihmcrobotics/promp-java"
   openSource = true

   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
   api("us.ihmc:javacpp:1.5.11-ihmc-2")
   api("us.ihmc:ihmc-native-library-loader:2.0.4")
   api("us.ihmc:log-tools:0.6.3")
}
