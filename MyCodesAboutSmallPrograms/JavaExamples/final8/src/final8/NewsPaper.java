package final8;

public class NewsPaper extends Media {

    private boolean online;

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public NewsPaper(double price, String title, boolean online) throws IllegalAccessException, Exception {
        super(price, title);
        setOnline(online);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String pnlineStatus = isOnlineOrNo();
        result.append(String.format("%d - %.2f - %s - %s \n", getId(), getPrice(), getTitle(), isOnlineOrNo()));
        return result.toString();
    }

    public String isOnlineOrNo() {
        if (this.online == true) {
            return "online";
        } else {
            return "offline";
        }
    }
}
