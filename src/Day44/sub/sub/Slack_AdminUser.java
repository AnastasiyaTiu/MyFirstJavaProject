package Day44.sub.sub;

import Day44.SlackUser;

/*
 behaviour :
    sendAtChannelMessage
            deleteMessage
    addChannel
    toString method
    constructor :
            3 argument constructor to set all fields value
 */
public class Slack_AdminUser extends SlackUser {
    int adminID;

    public Slack_AdminUser(String name, String status, int adminID) {
        this.adminID = adminID;
        this.name = name;
        this.status = status;
    }

    public static void main(String[] args) {
        Slack_AdminUser user1 = new Slack_AdminUser("Akbar", "Release the horses", 101);
        // --- inherited methods we are calling
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        // --- our own methods we are calling
        user1.addChannel();
        user1.deleteMessage();
        user1.sendAtChannelMessage();
        System.out.println("user1 = " + user1);

    }
    public String toString() {
        return "Slack_AdminUser{" +
                "adminID=" + adminID +
                ", status='" + status + '\'' +
                '}';
    }

    public void sendAtChannelMessage(){
       System.out.println(name + " sending channel message");
   }

   public void deleteMessage(){
       System.out.println(name + " deleting slack message");
   }

   public void addChannel(){
       System.out.println(name + " adding new channels");
   }


}
