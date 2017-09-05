#include <jni.h>
#include "com_kodeir_jcore_natives_HelloNativeImp.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_com_kodeir_jcore_natives_HelloNative_displayHelloNative
  (JNIEnv *env, jobject obj);
{
  printf("Hello world!\n");
  return;
}