package behavioralPatterns;

class SocialMedia 
{ 
    int likes, followers;  
    CurrentFollowersDisplay currentFollowersDisplay;  
  
    public SocialMedia(CurrentFollowersDisplay currentFollowersDisplay) 
    { 
        this.currentFollowersDisplay = currentFollowersDisplay;  
    } 
 
    private int getLatestLikes() 
    {  
        return 100; 
    } 
  
    private int getLatestFollowers() 
    {  
        return 20; 
    } 
   
    public void dataChanged() 
    { 
        likes = getLatestLikes(); 
        followers = getLatestFollowers();   
        currentFollowersDisplay.update(likes,followers);  
    } 
} 

class CurrentFollowersDisplay 
{ 
    private int likes, followers; 
    public void update(int likes,int followers) 
    { 
        this.likes = likes; 
        this.followers = followers;  
        display(); 
    } 
  
    public void display() 
    { 
        System.out.println("\nMy Social Media : \n\n" + "Likes: " + likes +"\nFollowers:"+ followers); 
    } 
} 


class ObserverPattern 
{ 
    public static void main(String args[]) 
    { 
        CurrentFollowersDisplay currentFollowersDisplay = new CurrentFollowersDisplay(); 
        SocialMedia socialMedia = new SocialMedia(currentFollowersDisplay);  
        socialMedia.dataChanged(); 
    } 
} 