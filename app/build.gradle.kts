plugins {
  id(BuildPlugins.ANDROID_APPLICATION)
  id(BuildPlugins.KOTLIN_ANDROID)
  id(BuildPlugins.KOTLIN_ANDROID_EXTENSIONS)
  id(BuildPlugins.KOTLIN_KAPT)
}

android {
  compileSdkVersion(ProjectProperties.COMPILE_SDK)

  defaultConfig {
    applicationId = ProjectProperties.APPLICATION_ID
    minSdkVersion(ProjectProperties.MIN_SDK)
    targetSdkVersion(ProjectProperties.TARGET_SDK)
    versionCode = 1
    versionName = "1.0.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    getByName("release") {
      isMinifyEnabled = true
      isShrinkResources = true
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
      resValue("string", "app_name", "Center Patient")
    }
    getByName("debug") {
      applicationIdSuffix = ProjectProperties.APPLICATION_ID_SUFFIX
      resValue("string", "app_name", "Center Patient Debug")
    }
  }

  buildFeatures {
    dataBinding = true
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  kotlinOptions {
    jvmTarget = JavaVersion.VERSION_1_8.toString()
  }

}

repositories {
  mavenCentral()
}

dependencies {
  implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar","*.aar"))))

  implementation(project(":businessdomain"))

  // Android Ui
  implementation(Lib.Android.CONSTRAINT_LAYOUT)
  implementation(Lib.Android.MATERIAL_DESIGN)

  // Lifecycle
  implementation(Lib.Lifecycle.VIEW_MODEL_KTX)
  implementation(Lib.Lifecycle.LIVE_DATA_KTX)
  implementation(Lib.Lifecycle.COMMON_JAVA8)

  // Testing
  testImplementation(TestLib.JUNIT)
  androidTestImplementation(TestLib.ANDROID_JUNIT)
  androidTestImplementation(AndroidTestLib.ESPRESSO_CORE)

  // LeakCanary
  debugImplementation(DebugLib.LEAK_CANARY)

  //Dagger
  implementation(Lib.DI.DAGGER)
  kapt(Lib.DI.DAGGER_COMPILER)

  //Jitsi
  implementation(Lib.Jitsi.JITSI) {
    isTransitive = true
  }

  //Razorpay
  implementation(Lib.Razorpay.RAZORPAY)

  implementation(Lib.Jwt.JSON_WEB_TOKEN)
  runtimeOnly(Lib.Jwt.JSON_WEB_TOKEN_1)
  runtimeOnly(Lib.Jwt.JSON_WEB_TOKEN_2){ exclude("org.json","josn")}

}
