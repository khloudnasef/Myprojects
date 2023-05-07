import cv2
import numpy

#read the image
img = cv2.imread('cat.jpeg')

#Resized_image = cv2.resize(img, None, fx= 0.5, fy=0.5)

# display the image
#cv2.imshow('resized', Resized_image)

height, width = img.shape[:2]
## Processing
rotation_matrix0=cv2.getRotationMatrix2D((width/2, height/2), 0, 1)
rotated_image0 =cv2.warpAffine(img, rotation_matrix0, (width, height))

rotation_matrix45=cv2.getRotationMatrix2D((width/2, height/2), 45, 1)
rotated_image45 =cv2.warpAffine(img, rotation_matrix45, (width, height))

rotation_matrix90=cv2.getRotationMatrix2D((width/2, height/2), 90, 1)
rotated_image90 =cv2.warpAffine(img, rotation_matrix90, (width, height))

rotation_matrix135=cv2.getRotationMatrix2D((width/2, height/2), 135, 1)
rotated_image135 =cv2.warpAffine(img, rotation_matrix135, (width, height))

rotation_matrix180=cv2.getRotationMatrix2D((width/2, height/2), 180, 1)
rotated_image180 =cv2.warpAffine(img, rotation_matrix180, (width, height))

rotation_matrix225=cv2.getRotationMatrix2D((width/2, height/2), 225, 1)
rotated_image225 =cv2.warpAffine(img, rotation_matrix225, (width, height))

rotation_matrix270=cv2.getRotationMatrix2D((width/2, height/2), 270, 1)
rotated_image270 =cv2.warpAffine(img, rotation_matrix270, (width, height))

rotation_matrix315=cv2.getRotationMatrix2D((width/2, height/2), 315, 1)
rotated_image315 =cv2.warpAffine(img, rotation_matrix315, (width, height))

rotation_matrix360=cv2.getRotationMatrix2D((width/2, height/2), 360, 1)
rotated_image360 =cv2.warpAffine(img, rotation_matrix360, (width, height))

#cv2.imshow('image',img)
cv2.imshow('rotated0',rotated_image0)
cv2.imshow('rotated45',rotated_image45)
cv2.imshow('rotated90',rotated_image90)
cv2.imshow('rotated135',rotated_image135)
cv2.imshow('rotated180',rotated_image180)
cv2.imshow('rotated225',rotated_image225)
cv2.imshow('rotated270',rotated_image270)
cv2.imshow('rotated315',rotated_image315)
cv2.imshow('rotated360',rotated_image360)
cv2.waitKey(0)

