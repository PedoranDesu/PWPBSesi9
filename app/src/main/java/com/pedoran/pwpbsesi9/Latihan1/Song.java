package com.pedoran.pwpbsesi9.Latihan1;

public class Song{
    private String name,singer;
    private int rank,pic;

    public Song(String name, String singer, int rank, int pic) {
        this.name = name;
        this.singer = singer;
        this.rank = rank;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
