import cv2
import numpy as np
import matplotlib.pyplot as plt

# Load the image
img = cv2.imread('scenery.jpg')

# Define the kernel sizes
kernel_sizes = [3, 5, 7]

# Apply Gaussian blur filters with different kernel sizes to the image
filtered_imgs = []
for ksize in kernel_sizes:
    filtered = cv2.GaussianBlur(img, (ksize, ksize), 0)
    filtered_imgs.append(filtered)

# Set up the subplots
fig, axes = plt.subplots(ncols=4, figsize=(16, 4), gridspec_kw={'wspace': 0})

# Display the original image and filtered images with their corresponding kernel sizes as titles
for i in range(len(filtered_imgs)):
    axes[i+1].imshow(cv2.cvtColor(filtered_imgs[i], cv2.COLOR_BGR2RGB))
    axes[i+1].text(0.05, 0.95, f'{i+1}', transform=axes[i+1].transAxes, fontsize=14,
                   color='white', ha='left', va='top', bbox=dict(facecolor='black', alpha=0.5))
    axes[i+1].set_title(f'Kernel Size: {kernel_sizes[i]}')

axes[0].imshow(cv2.cvtColor(img, cv2.COLOR_BGR2RGB))
axes[0].set_title('Original Image')
axes[0].text(0.05, 0.95, 'Original', transform=axes[0].transAxes, fontsize=14,
             color='white', ha='left', va='top', bbox=dict(facecolor='black', alpha=0.5))

# Remove axis from figure
for ax in axes:
    ax.axis('off')

# Show the plot
plt.show()