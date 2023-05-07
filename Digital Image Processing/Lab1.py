import cv2
import numpy as np

# Read the image
img = cv2.imread('cat.jpeg')

# Get the height and width of the image
height, width = img.shape[:2]

# Set the rotation angles
angles = [0, 45, 90, 135, 180, 225, 270, 315, 360]

# Initialize an empty list to store the rotated images
rotated_images = []

# Rotate the image at each angle and append it to the list
for angle in angles:
    rotation_matrix = cv2.getRotationMatrix2D((width/2, height/2), angle, 1)
    rotated_image = cv2.warpAffine(img, rotation_matrix, (width, height))
    rotated_images.append(rotated_image)

# Combine the rotated images into one matrix image
matrix_image = np.vstack([np.hstack(rotated_images[:3]), np.hstack(rotated_images[3:6]), np.hstack(rotated_images[6:])])

# Display the matrix image
cv2.imshow('Matrix Image', matrix_image)
cv2.waitKey(0)