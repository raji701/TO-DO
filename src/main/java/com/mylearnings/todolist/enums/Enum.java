package com.mylearnings.todolist.enums;

public class Enum {
    public enum TaskStatus{
        COMPLETED(1),NOT_COMPLETED(2);
        private final int value;
        TaskStatus(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

}