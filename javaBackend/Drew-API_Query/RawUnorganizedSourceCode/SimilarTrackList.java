package com.resonance.model;

public class SimilarTrackList {
  
  SimilarTrack[] track;

  public SimilarTrackList(SimilarTrack[] trackList) {
    this.track = trackList;
  }

  public SimilarTrack[] getTrackList() {
  return track;}

  public void setTrackList(SimilarTrack[] trackList) {
  this.track = trackList;}
}
