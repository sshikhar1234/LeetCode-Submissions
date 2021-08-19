class Logger {
    
    int timeStamp;
    String message;
    private HashMap<String,Integer> directory;
    /** Initialize your data structure here. */
    public Logger() {
        directory = new HashMap<String,Integer>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
    if(!(this.directory.containsKey(message))){
        this.directory.put(message,timestamp);
        return true;
    }
    Integer oldTimeStamp = this.directory.get(message);
    if(timestamp>=oldTimeStamp+10){
        this.directory.put(message,timestamp);
        return true;
    }else {
        return false;
    }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */