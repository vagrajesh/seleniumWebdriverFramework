package com.challanges;

public class UpvotesvsDownvotes {
    /**
     * Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed.
     * This is calculated by subtracting the number of downvotes from upvotes.
     *getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13
     * getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31
     * getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0
     */
    public static void main(String[] args){
        UpvotesvsDownvotes.getVoteCount(13,0);
        UpvotesvsDownvotes.getVoteCount(2,33);
        UpvotesvsDownvotes.getVoteCount(132,132);
    }
    public static int getVoteCount(int upvotes, int downvotes) {
        return upvotes - downvotes;
    }
}