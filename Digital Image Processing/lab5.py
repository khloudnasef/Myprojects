import cv2

# Create a VideoCapture object to read from the webcam
cap = cv2.VideoCapture(0)

# Check if camera opened successfully
if not cap.isOpened():
    print("Error opening video stream or file")

# Define a function to convert a frame to grayscale
def to_grayscale(frame):
    return cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

# Define a function to convert a frame to HSV
def to_hsv(frame):
    return cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)

# Read and display video frames until the user quits
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
        cv2.imshow('Webcam (left: original, middle: grayscale, right: HSV)', display_frame)

        # Press 'q' to exit
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break
    # Break the loop if no frame is captured
    else:
        break

# Release the capture and destroy all windows
cap.release()
cv2.destroyAllWindows()