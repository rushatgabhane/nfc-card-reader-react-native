#ifdef __cplusplus
#import "nfc-card-reader-react-native.h"
#endif

#ifdef RCT_NEW_ARCH_ENABLED
#import "RNNfcCardReaderReactNativeSpec.h"

@interface NfcCardReaderReactNative : NSObject <NativeNfcCardReaderReactNativeSpec>
#else
#import <React/RCTBridgeModule.h>

@interface NfcCardReaderReactNative : NSObject <RCTBridgeModule>
#endif

@end
