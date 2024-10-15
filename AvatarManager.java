import greenfoot.*;

public class AvatarManager extends Actor {
  // Queue of all possible avatars
  private Queue<Avatar> avatars = new Queue<>();

  // The current avatar
  private Avatar current;

  public AvatarManager() {
    setImage((GreenfootImage) null);

    // Load avatars into the queue
    avatars.enqueue(new Avatar("images/face_a.png"));
    avatars.enqueue(new Avatar("images/face_b.png"));
    avatars.enqueue(new Avatar("images/face_c.png"));

    current = avatars.dequeue();

  }

  @Override
  protected void addedToWorld(World world) {
    world.addObject(new Button(() -> next()), world.getWidth() / 2, world.getHeight() / 2);
    updateAvatar();
  }

  private void updateAvatar() {
    int x = 300;
    int y = 100;
    World world = getWorld();
    if (current != null) {
      world.removeObject(current);
    }
    world.addObject(current, x, y);
  }

  /**
   * Cycle to the next avatar
   */
  public void next() {
    avatars.enqueue(current);
    getWorld().removeObject(current);
    current = avatars.dequeue();
    updateAvatar();
  }
}
