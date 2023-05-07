import cv2
import os

# Load the RGB image
rgb_image = cv2.imread('lab3.jpeg')

# Convert the RGB image to grayscale
gray_image = cv2.cvtColor(rgb_image, cv2.COLOR_BGR2GRAY)

# Apply image processing filtering functions to detect objects
# Here we use Canny edge detection as an example
edges = cv2.Canny(gray_image, 50, 200)

# Find contours in the edges image
contours, hierarchy = cv2.findContours(edges.copy(), cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_NONE)

# Create a directory to store the detected objects
img_dir = 'detected_objects'
if not os.path.exists(img_dir):
    os.makedirs(img_dir)

# Loop over all the detected objects and save them as .jpg files
for i, contour in enumerate(contours):
    x, y, w, h = cv2.boundingRect(contour)

    # Draw a box frame around the object
    cv2.rectangle(rgb_image, (x, y), (x+w, y+h), (0, 255, 0), 2)

    # Crop the contour from the original RGB image
    cropped_contour = rgb_image[y:y+h, x:x+w]

    # Save the cropped contour as a .jpg file in the img_dir folder
    image_name = f"{img_dir}/object_{i+1}.jpg"
    cv2.imwrite(image_name, cropped_contour)

    # Add a label to the detected object in the original RGB image
    cv2.putText(rgb_image, f"Object {i+1}", (x, y-5), cv2.FONT_HERSHEY_SIMPLEX, 0.5, (0, 0, 255), 1)

# Display the original RGB image with labeled objects and box frames
cv2.imshow('Detected Objects', rgb_image)
cv2.waitKey(0)
cv2.destroyAllWindows()