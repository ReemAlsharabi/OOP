-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2022 at 06:06 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `moviedatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL,
  `AccountID` int(11) NOT NULL,
  `name` varchar(70) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` char(10) NOT NULL,
  `accType` char(5) NOT NULL,
  `DoB` date NOT NULL,
  `dateCreated` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `password`, `AccountID`, `name`, `email`, `phone`, `accType`, `DoB`, `dateCreated`) VALUES
('Aichaa', 'aicha100', 1, 'Aicha', 'Aicha@gmail.com', '0565760637', 'user', '2001-08-26', '2022-05-10'),
('Reeeeeeeeeeem', 'reem1234', 2, 'Reem', 'Reem@gmail.com', '0565760600', 'user', '2002-08-26', '2022-05-10'),
('Hanino', 'haninhanin', 3, 'Hanin', 'Hanin@gmail.com', '0565763322', 'user', '2000-08-26', '2022-05-10'),
('Alanoud', 'alanoud111', 4, 'Alanoud', 'Alanoud@gmail.com', '0553322111', 'user', '2002-03-20', '2022-05-10');

-- --------------------------------------------------------

--
-- Table structure for table `actor`
--

CREATE TABLE `actor` (
  `name` varchar(70) NOT NULL,
  `ActorID` int(11) NOT NULL,
  `DoB` date NOT NULL,
  `PoB` varchar(70) NOT NULL,
  `awards` varchar(200) NOT NULL,
  `info` varchar(400) NOT NULL,
  `image` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `acts`
--

CREATE TABLE `acts` (
  `characterName` varchar(70) NOT NULL,
  `role` varchar(70) NOT NULL,
  `MovieID` int(11) NOT NULL,
  `ActorID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `director`
--

CREATE TABLE `director` (
  `name` varchar(70) NOT NULL,
  `DirectorID` int(11) NOT NULL,
  `DoB` date DEFAULT NULL,
  `PoB` varchar(70) DEFAULT NULL,
  `awards` varchar(200) DEFAULT NULL,
  `info` varchar(400) DEFAULT NULL,
  `image` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `director`
--

INSERT INTO `director` (`name`, `DirectorID`, `DoB`, `PoB`, `awards`, `info`, `image`) VALUES
('Robert Eggers', 1, NULL, NULL, NULL, NULL, NULL),
('Dan Kwan\r\n', 2, NULL, NULL, NULL, NULL, NULL),
('Kenneth Branagh', 3, NULL, NULL, NULL, NULL, NULL),
('\r\nTom Gormican', 4, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `name` varchar(70) NOT NULL,
  `MovieID` int(11) NOT NULL,
  `showDate` date DEFAULT NULL,
  `addedDate` date NOT NULL,
  `description` varchar(500) NOT NULL,
  `genre` varchar(150) NOT NULL,
  `awards` varchar(300) DEFAULT NULL,
  `quote` varchar(400) DEFAULT NULL,
  `poster` blob DEFAULT NULL,
  `DirectorID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`name`, `MovieID`, `showDate`, `addedDate`, `description`, `genre`, `awards`, `quote`, `poster`, `DirectorID`) VALUES
('The Northman', 1, NULL, '2022-05-10', 'From visionary director Robert Eggers comes \r\nThe Northman, an action-filled epic that follows a \r\nyoung Viking prince on his quest to avenge \r\nhis father\'s murder', 'Action Adventure ', NULL, NULL, NULL, 1),
('Death', 2, NULL, '2022-05-10', 'While on vacation on the Nile, Hercule \r\nPoirot must investigate the murder of a \r\nyoung heiress.\r\n', 'Drama Crime ', NULL, NULL, NULL, 2),
('Unberable', 3, NULL, '2022-05-10', 'In this action-packed comedy, Nicolas\r\nCage plays Nick Cage, channeling his iconic \r\ncharacters as he\'s caught between a superfan\r\n(Pedro Pascal) and a CIA agent \r\n(Tiffany Haddish).', 'Comedy Crime ', NULL, NULL, NULL, 3),
('Evreything', 4, NULL, '2022-05-10', 'An aging Chinese immigrant is swept up in an insane adventure, \r\nwhere she alone can save the world by exploring other universes \r\nconnecting with the lives she could have led.', 'Comedy Adventure', NULL, NULL, NULL, 4);

-- --------------------------------------------------------

--
-- Table structure for table `producer`
--

CREATE TABLE `producer` (
  `name` varchar(70) NOT NULL,
  `ProducerID` int(11) NOT NULL,
  `DoB` date DEFAULT NULL,
  `PoB` varchar(70) DEFAULT NULL,
  `awards` varchar(200) DEFAULT NULL,
  `info` varchar(400) DEFAULT NULL,
  `image` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `producer`
--

INSERT INTO `producer` (`name`, `ProducerID`, `DoB`, `PoB`, `awards`, `info`, `image`) VALUES
('Thomas Benski', 1, NULL, NULL, NULL, NULL, NULL),
('Allison Rose Carter', 2, NULL, NULL, NULL, NULL, NULL),
('Mark Gordon', 3, NULL, NULL, NULL, NULL, NULL),
('Kristin Burr', 4, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `produces`
--

CREATE TABLE `produces` (
  `role` varchar(70) DEFAULT NULL,
  `MovieID` int(11) NOT NULL,
  `ProducerID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produces`
--

INSERT INTO `produces` (`role`, `MovieID`, `ProducerID`) VALUES
(NULL, 1, 1),
(NULL, 2, 2),
(NULL, 3, 3),
(NULL, 4, 4);

-- --------------------------------------------------------

--
-- Table structure for table `reviews`
--

CREATE TABLE `reviews` (
  `MovieID` int(11) NOT NULL,
  `AccountID` int(11) NOT NULL,
  `ReviewID` int(2) NOT NULL,
  `comment` varchar(120) NOT NULL,
  `rating` double NOT NULL,
  `reviewDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reviews`
--

INSERT INTO `reviews` (`MovieID`, `AccountID`, `ReviewID`, `comment`, `rating`, `reviewDate`) VALUES
(1, 1, 1, 'good', 7.9, '2022-05-10'),
(2, 2, 2, 'good', 6.3, '2022-05-10'),
(3, 3, 3, 'good', 7.6, '2022-05-10'),
(4, 4, 4, 'good', 8.8, '2022-05-10');

-- --------------------------------------------------------

--
-- Table structure for table `writer`
--

CREATE TABLE `writer` (
  `name` varchar(70) NOT NULL,
  `WriterID` int(11) NOT NULL,
  `DoB` date DEFAULT NULL,
  `PoB` varchar(70) DEFAULT NULL,
  `awards` varchar(200) DEFAULT NULL,
  `info` varchar(400) DEFAULT NULL,
  `image` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `writer`
--

INSERT INTO `writer` (`name`, `WriterID`, `DoB`, `PoB`, `awards`, `info`, `image`) VALUES
('Sjón', 1, NULL, NULL, NULL, NULL, NULL),
('Daniel Scheinert', 2, NULL, NULL, NULL, NULL, NULL),
('Michael Green', 3, NULL, NULL, NULL, NULL, NULL),
('Kevin Etten', 4, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `writes`
--

CREATE TABLE `writes` (
  `writtingStyle` varchar(70) DEFAULT NULL,
  `MovieID` int(11) NOT NULL,
  `WriterID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `writes`
--

INSERT INTO `writes` (`writtingStyle`, `MovieID`, `WriterID`) VALUES
(NULL, 1, 1),
(NULL, 2, 2),
(NULL, 3, 3),
(NULL, 4, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`AccountID`),
  ADD UNIQUE KEY `password` (`password`),
  ADD UNIQUE KEY `phone` (`phone`);

--
-- Indexes for table `actor`
--
ALTER TABLE `actor`
  ADD PRIMARY KEY (`ActorID`);

--
-- Indexes for table `acts`
--
ALTER TABLE `acts`
  ADD KEY `acts` (`MovieID`),
  ADD KEY `acts2` (`ActorID`);

--
-- Indexes for table `director`
--
ALTER TABLE `director`
  ADD PRIMARY KEY (`DirectorID`);

--
-- Indexes for table `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`MovieID`),
  ADD KEY `directs` (`DirectorID`);

--
-- Indexes for table `producer`
--
ALTER TABLE `producer`
  ADD PRIMARY KEY (`ProducerID`);

--
-- Indexes for table `produces`
--
ALTER TABLE `produces`
  ADD KEY `produces` (`MovieID`),
  ADD KEY `produces2` (`ProducerID`);

--
-- Indexes for table `reviews`
--
ALTER TABLE `reviews`
  ADD PRIMARY KEY (`ReviewID`),
  ADD KEY `reviews` (`MovieID`),
  ADD KEY `reviews2` (`AccountID`);

--
-- Indexes for table `writer`
--
ALTER TABLE `writer`
  ADD PRIMARY KEY (`WriterID`);

--
-- Indexes for table `writes`
--
ALTER TABLE `writes`
  ADD KEY `writes` (`MovieID`),
  ADD KEY `writes2` (`WriterID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `AccountID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `actor`
--
ALTER TABLE `actor`
  MODIFY `ActorID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `director`
--
ALTER TABLE `director`
  MODIFY `DirectorID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `movie`
--
ALTER TABLE `movie`
  MODIFY `MovieID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `producer`
--
ALTER TABLE `producer`
  MODIFY `ProducerID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `reviews`
--
ALTER TABLE `reviews`
  MODIFY `ReviewID` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `writer`
--
ALTER TABLE `writer`
  MODIFY `WriterID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `acts`
--
ALTER TABLE `acts`
  ADD CONSTRAINT `acts_ibfk_1` FOREIGN KEY (`MovieID`) REFERENCES `movie` (`MovieID`),
  ADD CONSTRAINT `acts_ibfk_2` FOREIGN KEY (`ActorID`) REFERENCES `actor` (`ActorID`);

--
-- Constraints for table `movie`
--
ALTER TABLE `movie`
  ADD CONSTRAINT `movie_ibfk_1` FOREIGN KEY (`DirectorID`) REFERENCES `director` (`DirectorID`);

--
-- Constraints for table `produces`
--
ALTER TABLE `produces`
  ADD CONSTRAINT `produces_ibfk_1` FOREIGN KEY (`ProducerID`) REFERENCES `producer` (`ProducerID`),
  ADD CONSTRAINT `produces_ibfk_2` FOREIGN KEY (`MovieID`) REFERENCES `movie` (`MovieID`);

--
-- Constraints for table `reviews`
--
ALTER TABLE `reviews`
  ADD CONSTRAINT `reviews_ibfk_1` FOREIGN KEY (`MovieID`) REFERENCES `movie` (`MovieID`),
  ADD CONSTRAINT `reviews_ibfk_2` FOREIGN KEY (`AccountID`) REFERENCES `account` (`AccountID`);

--
-- Constraints for table `writes`
--
ALTER TABLE `writes`
  ADD CONSTRAINT `writes_ibfk_1` FOREIGN KEY (`MovieID`) REFERENCES `movie` (`MovieID`),
  ADD CONSTRAINT `writes_ibfk_2` FOREIGN KEY (`WriterID`) REFERENCES `writer` (`WriterID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
