import greenfoot.*;

public class MenuScreen extends World {

  public MenuScreen() {
    super(600, 400, 1);

    // Add instruction button
    addObject(new Button(() -> Greenfoot.setWorld(new InstructionScreen(this))), 300, 340);

    // Add avatar manager
    AvatarManager avatarManager = new AvatarManager();
    addObject(avatarManager, 300, 100);
  }
}
