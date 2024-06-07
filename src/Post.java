/**

A data structure that represents a single video on the Toktik app.
  title=sub2;
  likes=sub1.substring(0,sub1.indexOf(" "));
  video=post.substring(0,post.indexOf(" "));
It has three attributes: video, title and likes. */
class Post 
{ 
 // The path to the video file String video; // The number of times the video has been liked by other users String likes; // The caption of the video String title;

/**

Creates a new Post object from a string.

The string should contain three components separated by spaces: video, likes and title.

@param post The string that contains the post information */ 
  String title;
  String likes;
  String video;
public Post(String post) {

  /*
    Breaks down the post string into substrings and assigns them to the attributes.
  */
  String sub1= post.substring(post.indexOf(" ")+1,post.length());
  String sub2=sub1.substring(sub1.indexOf(" ")+1,sub1.length());
  title=sub2;
  likes=sub1.substring(0,sub1.indexOf(" "));
  video=post.substring(0,post.indexOf(" "));
}

/**

Returns a formatted string representation of the post.
@return A string that contains the title, video and likes of the post */
 public String toString() 
{ return ("Title:"+title +"\nVideo:"+video+ " \nNumber of likes:" +likes+"\n" );
}
}

