package com.alan.converter.converter;

public class DigitalStorage {
        public enum Binary {
            BYTE,
            KILOBYTE,
            MEGABYTE,
            GIGABYTE,
            TERABYTE,
            PETABYTE;

            public static Binary fromString(String text) {
                if (text != null) {
                    for (Binary binary : Binary.values()) {
                        if (text.equalsIgnoreCase(binary.toString())) {
                            return binary;
                        }
                    }
                }
                return null;
            }
        }
    }
