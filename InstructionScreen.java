import greenfoot.*;

public class InstructionScreen extends World {
  // The world to return to
  private World home;

  // Create instruction text. Must have at least one label
  private String[] allText = { "Screen 0", "Screen 1", "Screen 2" };

  // The index of the current label
  private int currentIndex = 0;
  private Label instructionLabel = new Label(allText[currentIndex], 50);

  public InstructionScreen(World home) {
    super(600, 400, 1);

    this.home = home;

    // Add the label
    addObject(instructionLabel, 300, 200);

    // Next button
    addObject(new Button(this::nextScreen), 500, 350);

    // Back button
    addObject(new Button(this::prevScreen), 100, 350);
  }

  private void nextScreen() {
    // Allow if within bounds of the array
    if (currentIndex >= allText.length - 1) {
      return;
    }
    currentIndex++;
    instructionLabel.setValue(allText[currentIndex]);
  }

  private void prevScreen() {
    // Exit if at the first screen
    if (currentIndex == 0) {
      Greenfoot.setWorld(home);
      return;
    } else {
      currentIndex--;
      instructionLabel.setValue(allText[currentIndex]);
    }

  }
}
