import cv2
import os

# Path to the video file/folder
path = "cat.mp4"

# Create a VideoCapture object to read from the video file/folder
if os.path.isdir(path):
    # If the path is a folder, get the first video file in the folder
    files = os.listdir(path)
    for file in files:
        if file.endswith((".mp4", ".avi", ".mov")):
            path = os.path.join(path, file)
            break
cap = cv2.VideoCapture(path)

# Check if video file opened successfully
if not cap.isOpened():
    print("Error opening video file")

# Define a function to convert a frame to grayscale
def to_grayscale(frame):
    return cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

# Define a function to convert a frame to HSV
def to_hsv(frame):
    return cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)

# Read and display video frames until the end of the video
while cap.isOpened():
    # Capture frame-by-frame
    ret, frame = cap.read()

    # If frame is read correctly, ret is True
    if ret:
        # Convert the frame to grayscale and HSV
        gray = to_grayscale(frame)
        hsv = to_hsv(frame)

        # Display the original, grayscale, and HSV frames side by side
        display_frame = cv2.hconcat([frame, cv2.cvtColor(gray, cv2.COLOR_GRAY2BGR), hsv])
        cv2.imshow('Video (left: original, middle: grayscale, right: HSV)', display_frame)
        

        # Press 'q' to exit
        if cv2.waitKey(10) & 0xFF == ord('q'):
            break
    # Break the loop if no frame is captured
    else:
        break

# Release the capture and destroy all windows
cap.release()
cv2.destroyAllWindows()