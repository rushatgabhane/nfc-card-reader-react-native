const NfcCardReaderReactNative =
  require('./NativeNfcCardReaderReactNative').default;

export function multiply(a: number, b: number): number {
  return NfcCardReaderReactNative.multiply(a, b);
}
