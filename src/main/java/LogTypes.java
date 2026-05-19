package main.java;

public enum LogTypes {
    DEBUG(1), INFO(2), WARN(3), ERROR(4);

    private final int level;

    LogTypes(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
