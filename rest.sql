SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rest`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `domain` int(11) NOT NULL,
  `status` int(11) DEFAULT '1',
  `regtime` datetime DEFAULT NULL,
  `employee` int(11) DEFAULT NULL,
  `rolls` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `domain`, `status`, `regtime`, `employee`, `rolls`) VALUES
(1, 'fnh', 'fnh@123', 1, 1, '2017-05-31 00:00:00', 1, 4),
(2, 'zigo', '123456', 2, 1, '2017-05-31 00:00:00', 2, 4),
(3, 'root', 'taurus', 3, 1, '2017-05-31 00:00:00', 3, 4),
(4, 'zcustomer', '123456', 2, 1, '2017-05-31 00:00:00', 4, 7),
(419, '0779950922', '123456', 1, 1, '2018-05-26 10:22:11', 420, 7);

-- --------------------------------------------------------

--
-- Table structure for table `rowdata`
--

CREATE TABLE `rowdata` (
  `regtime` datetime DEFAULT NULL,
  `lat` varchar(45) DEFAULT NULL,
  `lon` varchar(45) DEFAULT NULL,
  `speed` varchar(45) DEFAULT NULL,
  `acc` varchar(45) DEFAULT NULL,
  `input1` varchar(45) DEFAULT NULL,
  `input2` varchar(45) DEFAULT NULL,
  `input3` varchar(45) DEFAULT NULL,
  `input4` varchar(45) DEFAULT NULL,
  `gps` varchar(45) DEFAULT NULL,
  `id` varchar(50) NOT NULL,
  `status` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `stime` datetime DEFAULT NULL,
  `course` varchar(45) DEFAULT NULL,
  `fual` varchar(45) DEFAULT NULL,
  `milage` varchar(45) DEFAULT NULL,
  `logsource` varchar(45) DEFAULT NULL,
  `device` varchar(45) DEFAULT NULL,
  `moving` int(11) DEFAULT '0',
  `spare` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin5;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rowdata`
--
ALTER TABLE `rowdata`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
