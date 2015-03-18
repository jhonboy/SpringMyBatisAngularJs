-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 18 Mar 2015 pada 16.58
-- Versi Server: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `coba`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `comments`
--

CREATE TABLE IF NOT EXISTS `comments` (
  `idComment` char(64) NOT NULL,
  `idNews` char(64) NOT NULL,
  `comment` text NOT NULL,
  `userComment` char(64) NOT NULL,
  `dateComment` datetime NOT NULL,
  `ipComment` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `comments`
--

INSERT INTO `comments` (`idComment`, `idNews`, `comment`, `userComment`, `dateComment`, `ipComment`) VALUES
('00853686-973a-48b7-a805-44886b452baf', '967f0fe0-bd0a-11e4-a7cb-0000506313df', 'test', '2a31d372-8713-49b7-85c5-4bf64e81b94a', '2015-03-02 00:00:00', '127.0.0.2'),
('038bdeca-c027-11e4-ad7b-506313dd', '08c941fa-5737-4826-954d-713ea7103457', 'LAGI-LAGI HORAS', '967f0fe0-bd0a-11e4-a7cb-506313dd', '2015-03-01 00:00:00', '127.0.1'),
('0dbaec7b-00e4-4e94-b5ca-9f27f18732bc', '08c941fa-5737-4826-954d-713ea7103457', 'totntong', '2ef73791-0628-4a7a-9088-89167f1829dd', '2015-03-02 00:00:00', '127.0.0.2'),
('1e0e297f-c027-11e4-ad7b-506313dd', '08c941fa-5737-4826-954d-713ea7103457', 'LAGI-LAGI HAHAHAHHA', '967f0fe0-bd0a-11e4-a7cb-506313dd', '2015-03-01 22:24:56', '127.0.1'),
('2e9d6176-9c13-428a-92a5-d0ff71afd9c5', '08c941fa-5737-4826-954d-713ea7103457', '08c941fa-5737-4826-954d-713ea7103457', 'ddb94ed0-e8fd-4da7-9d90-4830e2687918', '2015-03-02 00:00:00', '127.0.0.2'),
('524a2b92-7f2c-4f71-b7ae-58bc0435f76b', '08c941fa-5737-4826-954d-713ea7103457', 'asdgasd', 'e0a0d604-9d0e-45d6-846e-9c11751b4b17', '2015-03-02 00:00:00', '127.0.0.2'),
('5a975bcf-b442-4811-90b7-a60e7024ce1f', '967f0fe0-bd0a-11e4-a7cb-0000506313df', 'gono', '2224e759-ba0f-4f01-bfba-63203bbe487f', '2015-03-15 00:00:00', '127.0.0.2'),
('630a85f6-c022-11e4-ad7b-506313dd', '08c941fa-5737-4826-954d-713ea7103457', 'horas boh', '967f0fe0-bd0a-11e4-a7cb-506313dd', '2015-03-01 00:00:00', '172.0.0.1'),
('668c1ede-cbbe-40d3-8599-bccf135e5cbb', '967f0fe0-bd0a-11e4-a7cb-0000506313df', 'test', '953d10b4-d8df-4e96-981c-84221f2a5d7a', '2015-03-10 00:00:00', '127.0.0.2'),
('7f1abd89-492b-4ea4-acd9-200633712707', '08c941fa-5737-4826-954d-713ea7103457', '08c941fa-5737-4826-954d-713ea7103457  asas', '4e294346-91cc-4cc1-966c-2614e4a7208e', '2015-03-02 00:00:00', '127.0.0.2'),
('9e74dc04-1d59-47f5-bfd8-ce57287e8f61', '08c941fa-5737-4826-954d-713ea7103457', 'sdfg', 'be7d90e0-ff59-411f-8a48-a44d429d009f', '2015-03-02 00:00:00', '127.0.0.2'),
('a69fc474-ae18-46af-aa3d-d70cb74bf309', '967f0fe0-bd0a-11e4-a7cb-0000506313df', 'test', '88f94d67-a6fe-4279-bfb4-2e4a1c65f7d9', '2015-03-10 00:00:00', '127.0.0.2'),
('ad1a01f6-7a99-4167-be20-666b25da147d', '967f0fe0-bd0a-11e4-a7cb-0000506313df', 'test', '6bedc90c-a2c6-4756-af84-9e7404b3e527', '2015-03-15 00:00:00', '127.0.0.2'),
('ade1c1b9-cc86-46b6-baf6-2072d100cb34', '967f0fe0-bd0a-11e4-a7cb-0000506313df', 'teas', '48707ad7-f44e-467f-a63d-f43c057805be', '2015-03-02 00:00:00', '127.0.0.2'),
('b0edafef-151d-4b20-8c13-d131cc57737b', '967f0fe0-bd0a-11e4-a7cb-0000506313df', 'haha', 'cee0b1fe-c08e-44c9-aee4-b25b2ca6aa02', '2015-03-02 00:00:00', '127.0.0.2'),
('f0958ebd-d114-41fd-9f67-e91b2e329a38', '08c941fa-5737-4826-954d-0000713ea710', 'hono', 'c62e6f34-ceb9-4509-ad1e-40daa9ce89ca', '2015-03-15 00:00:00', '127.0.0.2'),
('f289869a-8598-4658-88d8-471d214cb398', '08c941fa-5737-4826-954d-0000713ea710', 'test', 'dbefd527-d820-4927-98dc-81aabd47493c', '2015-03-10 00:00:00', '127.0.0.2');

-- --------------------------------------------------------

--
-- Struktur dari tabel `family`
--

CREATE TABLE IF NOT EXISTS `family` (
  `id` char(64) NOT NULL,
  `parent_id` char(64) NOT NULL,
  `name` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `family`
--

INSERT INTO `family` (`id`, `parent_id`, `name`) VALUES
('1', '', 'ortu'),
('2', '1', 'best'),
('3', '1', 'johan'),
('4', '1', 'boi'),
('5', '2', 'ucok');

-- --------------------------------------------------------

--
-- Struktur dari tabel `news`
--

CREATE TABLE IF NOT EXISTS `news` (
  `idNews` char(32) NOT NULL,
  `title` varchar(200) NOT NULL,
  `author` varchar(200) NOT NULL,
  `cat` varchar(200) NOT NULL,
  `news` text NOT NULL,
  `source` varchar(200) NOT NULL,
  `images` varchar(200) NOT NULL,
  `createDate` date NOT NULL,
  `updateDate` date NOT NULL,
  `fileAttach` varchar(200) NOT NULL,
  `ipCreate` varchar(299) NOT NULL,
  `ipUpdate` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `news`
--

INSERT INTO `news` (`idNews`, `title`, `author`, `cat`, `news`, `source`, `images`, `createDate`, `updateDate`, `fileAttach`, `ipCreate`, `ipUpdate`) VALUES
('08c941fa-5737-4826-954d-713ea710', 'Horas Bangso Batak', 'Jhon boy Sibuea', 'hot', 'tudia nama luluan', 'http://horas', 'images.jpg', '2015-02-25', '2015-02-25', 'FILE.DOC', '127.0.0.0', '127.0.0.1'),
('967f0fe0-bd0a-11e4-a7cb-506313df', 'Mulak tu Bona Pasogit', 'Jhon boy Sibuea', 'hot', ' Mari kita ke Samosir, ada konser musik “Mulak tu Bona Pasogit” di Kampung Halaman (Bona Pasogit). Harian Boho (30/12) di kampung sastrawan Sitor Situmorang dilahirkan ada konser musik Mulak tu Bona Pasogit, acara yang diselenggarakan Rumah Karya Indonesia ini cukup meraih karena turut hadir para musisi, perorangan maupun komunitas cuma berasal dari Medan atau Sumatera Utara, tetapi juga dari Jakarta, Yogyakarta, bahkan Rumania.Seperti pemain seruling Martogi Sitohang yang sangat terkenal. Hardoni Sitohang & Team, KOtantra USu, Black Canel USU, Komunal Primitif USU, Incidental Music, T n F Brass Band, Hendra Ginting, Forum Generasi Muda Batak, Anak-anak Harian Boho, Jendela, Toba, Seribu Sajak Tao Toba, dan RKI. Dari Jakarta; Horjabius, Gorame Band, dan Paulus Simangunsong. Dari Yogyakarta NOS, Dari Rumania; Mihai.Ojax Manalu sebagai manejer Rumah Karya Indonesia, pemain gondang (alat musik gendang tradisional Batak) Martahan Sitohang lah yang merupakan penggagas konser Mulak Tu Bona Pasogit ini.', 'http://horas', 'images.jpg', '2015-02-25', '2015-03-25', 'FILaE.DOC', '127.0.0.0', '127.0.0.1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `person`
--

CREATE TABLE IF NOT EXISTS `person` (
  `ID` int(11) NOT NULL,
  `FIRSTNAME` varchar(60) NOT NULL,
  `LASTNAME` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `person`
--

INSERT INTO `person` (`ID`, `FIRSTNAME`, `LASTNAME`) VALUES
(13, 'asdads', 'asdfasdf'),
(13, 'asdads', 'asdfasdf'),
(13, 'salahku', 'salahku'),
(13, 'asdgasdg', 'asdgas'),
(13, 'asdg', 'asdg'),
(13, 'asdg', 'asdg'),
(13, 'asdgasdg', 'asdgasdg'),
(13, 'adsga', 'adghasdg'),
(13, 'asdg', 'adsg'),
(13, 'asdgds', 'adsgsadg'),
(13, 'asdg', 'asdg'),
(13, 'asdgasdf', 'asdgasdg'),
(13, 'asdgasdf', 'asdgasdg'),
(13, 'xdfasd', 'asdfsd'),
(13, 'asdg', 'asdg'),
(13, 'asdg', 'asdg'),
(13, 'asdg', 'asdg'),
(13, 'asdg', 'asdg'),
(13, 'asdg', 'asdg'),
(13, 'adsg', 'adsg'),
(13, 'asdgasdg', 'asdg'),
(13, 'lssslls', 'lalallalal'),
(13, 'lssslls', 'lalallalal');

-- --------------------------------------------------------

--
-- Struktur dari tabel `post`
--

CREATE TABLE IF NOT EXISTS `post` (
  `ID` int(11) NOT NULL,
  `NEWS` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `post`
--

INSERT INTO `post` (`ID`, `NEWS`) VALUES
(12, 'saef'),
(12, 'saefa'),
(12, 'asdggadg'),
(12, 'asdgadsg'),
(12, 'asdgasdg'),
(12, ''),
(12, 'adsg'),
(12, 'adsg'),
(12, 'adsg'),
(12, 'adsg'),
(12, 'adsg'),
(12, 'asdgasdg'),
(12, '1'),
(12, 'asdg');

-- --------------------------------------------------------

--
-- Struktur dari tabel `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `username` varchar(120) NOT NULL,
  `role` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `role`
--

INSERT INTO `role` (`username`, `role`) VALUES
('jhon', 'ROLE_USER');

-- --------------------------------------------------------

--
-- Struktur dari tabel `unit`
--

CREATE TABLE IF NOT EXISTS `unit` (
  `id` varchar(16) NOT NULL,
  `name` varchar(100) NOT NULL,
  `detail` varchar(100) NOT NULL,
  `amount` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `unit`
--

INSERT INTO `unit` (`id`, `name`, `detail`, `amount`, `price`) VALUES
('1', 'INNOVA', 'SUPER LUZ', '1000', '10000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `userdetails`
--

CREATE TABLE IF NOT EXISTS `userdetails` (
  `username` varchar(100) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `middlename` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `userdetails`
--

INSERT INTO `userdetails` (`username`, `firstname`, `middlename`, `lastname`) VALUES
('jhon', 'jhon', 'boy', 'sibuea');

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(120) NOT NULL,
  `password` varchar(120) NOT NULL,
  `enabled` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
('jhon', 'jhon', 'true');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
 ADD PRIMARY KEY (`idComment`);

--
-- Indexes for table `family`
--
ALTER TABLE `family`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
 ADD PRIMARY KEY (`idNews`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
 ADD PRIMARY KEY (`username`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
 ADD PRIMARY KEY (`username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
