import cv2

# Read the video from file
video_path = "cat.mp4"
cap = cv2.VideoCapture(video_path)

# Check if video file is opened successfully
if not cap.isOpened():
    print("Error opening video file")

# Define the parameters for the Gaussian blur filter
kernel_size = (13, 13)
sigma_x = 0

# Define the parameters for the median blur filter
median_kernel_size = 13

# Define the parameters for the bilateral filter
bilateral_diameter = 13
bilateral_sigma_color = 75
bilateral_sigma_space = 75

# Loop through the frames of the video and apply the Gaussian blur filter
while cap.isOpened():
    # Read a frame from the video
    ret, frame = cap.read()

    # If the frame was read successfully, apply the Gaussian blur filter
    if ret:
        blurred_frame = cv2.GaussianBlur(frame, kernel_size, sigma_x)

        # Apply the median blur filter
        median_blurred_frame = cv2.medianBlur(frame, median_kernel_size)

        # Apply the bilateral filter
        bilateral_filtered_frame = cv2.bilateralFilter(frame, bilateral_diameter, bilateral_sigma_color, bilateral_sigma_space)

        # Display the resulting frame
        cv2.imshow("Original", frame)
        cv2.imshow("Smoothed Video (Gaussian)", cv2.GaussianBlur(frame, kernel_size, sigma_x))
        cv2.imshow("Smoothed Video (Median)", median_blurred_frame)
        cv2.imshow("Smoothed Video (Bilateral)", bilateral_filtered_frame)

        # Exit if the user presses 'q'
        if cv2.waitKey(20) & 0xFF == ord('q'):
            break
    else:
        break

# Release the resources used by the video capture object and close all windows
cap.release()
cv2.destroyAllWindows()