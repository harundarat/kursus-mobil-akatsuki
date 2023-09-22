-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 31 Des 2022 pada 02.47
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kursus`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `client`
--

CREATE TABLE `client` (
  `nik` varchar(16) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `hp` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `client`
--

INSERT INTO `client` (`nik`, `nama`, `alamat`, `hp`) VALUES
('123', 'Jaladri', 'Purwokerto', '086545'),
('12313', 'Rasyid', 'Baturaden', '0865124'),
('5432', 'Langit', 'Bandung', '08123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `instruktur`
--

CREATE TABLE `instruktur` (
  `id_instruktur` int(6) NOT NULL,
  `nama_instruktur` varchar(50) NOT NULL,
  `alamat_instruktur` text NOT NULL,
  `hp_instruktur` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `instruktur`
--

INSERT INTO `instruktur` (`id_instruktur`, `nama_instruktur`, `alamat_instruktur`, `hp_instruktur`) VALUES
(3, 'Kelvin', 'Ajibarang', '0858'),
(4, 'Sandi', 'Bumiayu', '0895'),
(5, 'Nohan', 'Purwokerto', '0856'),
(6, 'Harun', 'Sokaraja', '0896'),
(7, 'Hendra', 'Kroya', '0888'),
(8, 'Samas', 'Purbalingga', '0854'),
(9, 'Beni', 'Bumiayu', '0889');

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal`
--

CREATE TABLE `jadwal` (
  `id_jadwal` int(6) NOT NULL,
  `id_instruktur` int(6) NOT NULL,
  `waktu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `jadwal`
--

INSERT INTO `jadwal` (`id_jadwal`, `id_instruktur`, `waktu`) VALUES
(6, 3, ' Hari  : Senin, Selasa, Rabu\n Jam   : 09.00 - 11.00'),
(7, 4, ' Hari  : Kamis, Jum\'at, Sabtu\n Jam   : 09.00 - 11.00'),
(8, 6, ' Hari  : Senin, Selasa, Rabu\n Jam   : 14.00 - 16.00'),
(9, 7, ' Hari  : Kamis, Jum\'at, Sabtu\n Jam   : 14.00 - 16.00'),
(10, 6, ' Hari  : Kamis, Jum\'at, Sabtu\n Jam   : 09.00 - 11.00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin'),
('kelpin', 'kelpin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `paket`
--

CREATE TABLE `paket` (
  `id_paket` int(6) NOT NULL,
  `nama_mobil` varchar(30) NOT NULL,
  `transmisi_mobil` varchar(8) NOT NULL,
  `pertemuan` int(11) NOT NULL,
  `harga` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `paket`
--

INSERT INTO `paket` (`id_paket`, `nama_mobil`, `transmisi_mobil`, `pertemuan`, `harga`) VALUES
(3, 'Ferrari', 'Otomatis', 9, 900000),
(4, 'Avanza', 'Manual', 5, 500000),
(5, 'Kijang', 'Manual', 4, 400000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(6) NOT NULL,
  `id_jadwal` int(6) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `id_paket` int(6) NOT NULL,
  `status` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_jadwal`, `nik`, `id_paket`, `status`) VALUES
(3, 7, '123', 3, 'Selesai'),
(4, 7, '12313', 4, 'Berjalan'),
(5, 8, '5432', 5, 'Selesai');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `instruktur`
--
ALTER TABLE `instruktur`
  ADD PRIMARY KEY (`id_instruktur`);

--
-- Indeks untuk tabel `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`id_jadwal`),
  ADD KEY `id_instruktur` (`id_instruktur`);

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD KEY `username` (`username`);

--
-- Indeks untuk tabel `paket`
--
ALTER TABLE `paket`
  ADD PRIMARY KEY (`id_paket`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_jadwal` (`id_jadwal`),
  ADD KEY `nik` (`nik`),
  ADD KEY `id_paket` (`id_paket`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `instruktur`
--
ALTER TABLE `instruktur`
  MODIFY `id_instruktur` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT untuk tabel `jadwal`
--
ALTER TABLE `jadwal`
  MODIFY `id_jadwal` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `paket`
--
ALTER TABLE `paket`
  MODIFY `id_paket` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `jadwal_ibfk_1` FOREIGN KEY (`id_instruktur`) REFERENCES `instruktur` (`id_instruktur`) ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_jadwal`) REFERENCES `jadwal` (`id_jadwal`) ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`nik`) REFERENCES `client` (`nik`) ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`id_paket`) REFERENCES `paket` (`id_paket`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
