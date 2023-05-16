-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2023 at 03:20 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `system_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `puroks`
--

CREATE TABLE `puroks` (
  `purok_id` int(10) NOT NULL,
  `res_id` int(10) NOT NULL,
  `purok_name` varchar(100) NOT NULL,
  `purok_desc` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `puroks`
--

INSERT INTO `puroks` (`purok_id`, `res_id`, `purok_name`, `purok_desc`) VALUES
(3, 3, 'Tangigue', 'Near BRC Building '),
(4, 4, 'Bolinao', 'Near Chapel');

-- --------------------------------------------------------

--
-- Table structure for table `reports`
--

CREATE TABLE `reports` (
  `report_id` int(10) NOT NULL,
  `res_id` int(10) NOT NULL,
  `purok_id` int(10) NOT NULL,
  `report_date` varchar(1000) NOT NULL,
  `report_desc` varchar(100) NOT NULL,
  `report_status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reports`
--

INSERT INTO `reports` (`report_id`, `res_id`, `purok_id`, `report_date`, `report_desc`, `report_status`) VALUES
(9, 3, 3, 'asd', 'asdasd', 'Not Actioned');

-- --------------------------------------------------------

--
-- Table structure for table `residents`
--

CREATE TABLE `residents` (
  `res_id` int(10) NOT NULL,
  `res_lname` varchar(50) NOT NULL,
  `res_fname` varchar(50) NOT NULL,
  `res_bdate` varchar(50) NOT NULL,
  `res_gender` varchar(50) NOT NULL,
  `res_status` varchar(50) NOT NULL,
  `res_child` varchar(50) NOT NULL,
  `res_contact` varchar(50) NOT NULL,
  `res_email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `residents`
--

INSERT INTO `residents` (`res_id`, `res_lname`, `res_fname`, `res_bdate`, `res_gender`, `res_status`, `res_child`, `res_contact`, `res_email`) VALUES
(3, 'Aniñon', 'Mark Eliezon', '12/12/2000', 'Male', 'Single', '0923423422', 'none', 'eliezon@gmail.com'),
(4, 'Cano', 'John Paul', '09/23/2001', 'Male', 'Engaged', '0923405622', 'none', 'jpcano@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `u_id` int(11) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_bdate` varchar(50) NOT NULL,
  `u_user` varchar(50) NOT NULL,
  `u_pword` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`u_id`, `u_lname`, `u_fname`, `u_bdate`, `u_user`, `u_pword`, `u_email`) VALUES
(1, 'Aniñon', 'mark', '12/12/2000', 'mark123', '123123', 'eliezon@gmail.com'),
(2, 'adas', 'asd', 'asda', 'dasd', 'sdas', 'asdasd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `puroks`
--
ALTER TABLE `puroks`
  ADD PRIMARY KEY (`purok_id`),
  ADD KEY `res_id` (`res_id`);

--
-- Indexes for table `reports`
--
ALTER TABLE `reports`
  ADD PRIMARY KEY (`report_id`),
  ADD KEY `res_id` (`res_id`),
  ADD KEY `purok_id` (`purok_id`);

--
-- Indexes for table `residents`
--
ALTER TABLE `residents`
  ADD PRIMARY KEY (`res_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `puroks`
--
ALTER TABLE `puroks`
  MODIFY `purok_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `reports`
--
ALTER TABLE `reports`
  MODIFY `report_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `residents`
--
ALTER TABLE `residents`
  MODIFY `res_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `puroks`
--
ALTER TABLE `puroks`
  ADD CONSTRAINT `puroks_ibfk_1` FOREIGN KEY (`res_id`) REFERENCES `residents` (`res_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reports`
--
ALTER TABLE `reports`
  ADD CONSTRAINT `reports_ibfk_1` FOREIGN KEY (`res_id`) REFERENCES `residents` (`res_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reports_ibfk_2` FOREIGN KEY (`purok_id`) REFERENCES `puroks` (`purok_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
