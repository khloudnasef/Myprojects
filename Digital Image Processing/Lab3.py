

import cv2

# Load the RGB image
rgb_image = cv2.imread('lab3.jpeg')

# Convert the RGB image to grayscale
gray_image = cv2.cvtColor(rgb_image, cv2.COLOR_BGR2GRAY)

# Save the grayscale image
#cv2.imshow('original', rgb_image)
#cv2.imshow('gray', gray_image)
#cv2.waitKey(0)

edges = cv2.Canny(gray_image, 50, 200)
countours,hierarchy = cv2.findContours(edges.copy(), cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_NONE)
sorted_countours =  sorted(countours, key= cv2.contourArea, reverse=True)

for (i,c) in enumerate(sorted_countours):
    x,y,w,h =cv2.boundingRect(c)


    cropped_countour = rgb_image[y:y+h, x:x+w]
    image_name = "ouput_shape_number "+str(i+1)+".jpg"
    cv2.imwrite(image_name, cropped_countour)
    readimage = cv2.imread(image_name)
    cv2.imshow('image', readimage)
    cv2.waitKey(0)

cv2.destroyAllWindows()



#for i, Countour in enumerate(countours):
  #  x,y,w,h = cv2.boundingRect(Countour)
    #crop_image = rgb_image[y:y+h, x:x+w]
    #cv2.imwrite(f' crop_image_{i}.jpg', crop_image)
    #cv2.imshow(crop_image)
    #cv2.waitKey(0)
