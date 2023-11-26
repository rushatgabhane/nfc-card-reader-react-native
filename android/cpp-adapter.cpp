#include <jni.h>
#include "nfc-card-reader-react-native.h"

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_nfccardreaderreactnative_NfcCardReaderReactNativeModule_nativeMultiply(JNIEnv *env, jclass type, jdouble a, jdouble b) {
    return nfccardreaderreactnative::multiply(a, b);
}
