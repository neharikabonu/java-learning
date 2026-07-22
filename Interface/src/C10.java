public class C10 {
  public static void main(String[] args) {
    Camera camera = new SmartPhone();
    MusicPlayer music = new SmartPhone();
    GPS gps = new SmartPhone();

    camera.takePicture();
    camera.takeVideo();

    music.play();
    music.stop();

    gps.locate();
  }
}

interface Camera {
  void takePicture();
  void takeVideo();
}

interface MusicPlayer {
  void play();
  void stop();
}

interface GPS {
  void locate();
}

class SmartPhone implements Camera, MusicPlayer, GPS {
  @Override
  public void takePicture() {
    System.out.println("Taking a picture");
  }

  @Override
  public void takeVideo() {
    System.out.println("Taking a video");
  }

  @Override
  public void play() {
    System.out.println("Playing music");
  }

  @Override
  public void stop() {
    System.out.println("Music stopped");
  }

  @Override
  public void locate() {
    System.out.println("Location turned on");
  }
}