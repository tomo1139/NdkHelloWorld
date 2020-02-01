#include <string.h>
#include <jni.h>

jstring Java_develop_tomo1139_ndkhelloworld_MainActivity_helloWorld(JNIEnv* env, jobject javaThis) {
    return (*env)->NewStringUTF(env, "Hello World!!");
}
