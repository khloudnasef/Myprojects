-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2022 at 03:34 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `allphptricks`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(10) NOT NULL,
  `name` varchar(250) NOT NULL,
  `description` longtext NOT NULL,
  `code` varchar(100) NOT NULL,
  `price` double(9,2) NOT NULL,
  `image` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `description`, `code`, `price`, `image`) VALUES
(1, 'Dahlia! Fix My Skin Cleanser', 'Fast-cleaning, easy rinse cleanser that helps strengthen, firm, smooth, nourish and brighten the appearance of skin infused with orchid petals.', '001', 50.00, 'cleaser1.png'),
(2, 'Dahlia! No Flaw Serum', 'A serum infused with premium purple orchid from Jeju, South Korea. No Flaw Serum helps fix hyperpigmentation and leaves skin feeling smooth, supple and bright.', '002', 54.00, 'serum1.png'),
(3, 'Dahlia! Eternal Elixir', 'One word. Magic. Our Eternal Elixir has been proven to reduce fine lines and wrinkles effectively without any side effects! Just a drop and you shall feel the magic', '003', 67.00, 'elixir.png'),
(4, 'Dahlia! Glow Water', 'Glow Water is used after cleansing and before serum. Our Glow Water leaves the skin feeling crisp and refreshed. Best used with our Eternal Elixir.', '004', 45.00, 'glowwater.png'),
(5, 'Dahlia! Perfect Drop', 'An overall multitasking serum that helps get rid of skin troubles while also preventing breakouts. Perfect for sensitive skin.', '005', 65.00, 'drop.png'),
(6, 'Dahlia! Radiant Goddess', 'The last step of our goddess’s skincare! Dahlia! Radiant Goddess is a cream that protects skin from impurities and dirts found in air particles. Have a barrier before facing the world!!', '006', 54.00, 'radiant.png');

-- --------------------------------------------------------

--
-- Table structure for table `products2`
--

CREATE TABLE `products2` (
  `id` int(10) NOT NULL,
  `name` varchar(250) NOT NULL,
  `description` longtext NOT NULL,
  `code` varchar(100) NOT NULL,
  `price` double(9,2) NOT NULL,
  `image` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products2`
--

INSERT INTO `products2` (`id`, `name`, `description`, `code`, `price`, `image`) VALUES
(1, 'Lily! Clean Everything Cleanse', 'This creamy and moist foam cleanser removes impurities effectively and clears pores thoroughly while leaving the skin hydrated long after cleansing. Best used in bare skin or to clean makeup after Demure’ Goddesses have a long day!', '001', 50.00, 'cleanser.png'),
(2, 'Lily! Help Me Toner', 'This soothing toner helps to tighten pores and reveal a clear and healthy skin. The lightweight formula is absorbed quickly into the skin and instantly replenishes the skin with hydration. If you need an instant blemish care, Help Me Toner will definitely give you a hand!', '002', 40.00, 'toner.png'),
(3, 'Lily! Make Me Glow Serum', 'A high performance daily care serum that has been processed to help you achieve a brighter, clearer goddess glow. This serum is rich in Vitamin C derived from Jeju Hallabong, a super fruit.', '003', 68.00, 'serum.png'),
(4, 'Lily! Glow Goddess Moisturizer', 'A goddess’s must have product! Glow Goddess Moisturizer is an all daily blemish care cream that smoothly glides onto skin, instantly hydrates and blurs out flaw while giving our goddess a beautiful glow as if it’s from within.', '004', 48.00, 'moisturizer.png'),
(5, 'Lily! SOS Spot Treatment', 'Emergency call! We can’t let our goddess face the world with sudden troubles which is how we came up with the idea of SOS Spot Treatment! Apply to desired area as a coating to keep acne calm and get rid of unwanted redness!', '005', 64.00, 'spotcream.png'),
(6, 'Lily! Save My Sleep Cream', 'A cream that helps repair our goddess’s skin barrier while they have their beauty sleep so they could start the day without a flaw. Good sleep + Good Sleep Cream = Great Day!', '006', 56.00, 'sleepcream.png');

-- --------------------------------------------------------

--
-- Table structure for table `user_form`
--

CREATE TABLE `user_form` (
  `id` int(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `user_type` varchar(255) NOT NULL DEFAULT 'user'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_form`
--

INSERT INTO `user_form` (`id`, `name`, `email`, `password`, `user_type`) VALUES
(1, 'khloud', 'khloudnasef2003@gmail.com', '682c6e0d45b1bdddb72d07edca562a9a', 'user'),
(2, 'Izue', 'izue@gmail.com', '202cb962ac59075b964b07152d234b70', 'user'),
(3, 'eithar', 'eithar@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055', 'user'),
(5, 'adam', 'adam@gmail.com', '202cb962ac59075b964b07152d234b70', 'user'),
(6, 'cathy', 'cathy@gmail.com', '202cb962ac59075b964b07152d234b70', 'user'),
(8, 'Amal', 'amalabbas@utm.my', '202cb962ac59075b964b07152d234b70', 'admin'),
(9, 'khloe', 'koko@gmail.com', '202cb962ac59075b964b07152d234b70', 'user'),
(11, 'nora', 'nora@gmail.com', '202cb962ac59075b964b07152d234b70', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `code` (`code`);

--
-- Indexes for table `products2`
--
ALTER TABLE `products2`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_form`
--
ALTER TABLE `user_form`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `products2`
--
ALTER TABLE `products2`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user_form`
--
ALTER TABLE `user_form`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
