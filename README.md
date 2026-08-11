# 🔗 First-Blockchain-with-Java

<p center>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Blockchain-3C3C3D?style=for-the-badge&logo=ethereum&logoColor=white" alt="Blockchain" />
  <img src="https://img.shields.io/badge/Cryptography-SHA--256-blue?style=for-the-badge" alt="SHA-256" />
</p>

---

## 📌 Overview

Welcome to **First-Blockchain-with-Java**! This project is a lightweight, ground-up implementation of a functional blockchain built purely in **Java**. It demonstrates core decentralized concepts including block chaining, cryptographic hashing using **SHA-256**, and a simple **Proof-of-Work (Mining)** consensus algorithm.

---

## ⚙️ How Blockchains Work

A **blockchain** is an immutable, distributed ledger composed of sequentially linked "blocks".

```text
+-------------------+   +-------------------+   +-------------------+
|      BLOCK 0      |-->|      BLOCK 1      |-->|      BLOCK 2      |
|  (Genesis Block)  |   |                   |   |                   |
+-------------------+   +-------------------+   +-------------------+
| Data: "Genesis"   |   | Data: "Tx 10 USD" |   | Data: "Tx 50 USD" |
| Prev Hash: "0"    |   | Prev Hash: 00a1...|   | Prev Hash: 00f4...|
| Hash: 00a1...     |   | Hash: 00f4...     |   | Hash: 00e9...     |
| Nonce: 4821       |   | Nonce: 12049      |   | Nonce: 8593       |
+-------------------+   +-------------------+   +-------------------+
```

### Key Components:

1. 📦 **Block Data**: Stores transaction details or payloads, timestamps, and a unique identifier.
2. 🔑 **Cryptographic Hash (SHA-256)**: Each block generates a unique digital fingerprint based on its data, timestamp, nonce, and the previous block's hash.
3. 🔗 **PrevHash Connection**: Every block explicitly references the hash of the block before it. If any block's data is altered, its hash changes, breaking the entire chain.
4. ⛏️ **Proof of Work (Mining)**: Miners must solve a computational puzzle—finding a numeric `nonce` that produces a hash starting with a specified number of leading zeroes (e.g., `0000`).

---

## 📊 Block Creation & Chain Lifecycle

```
[ New Transaction / Data ]
│
▼
[ Construct New Block with Prev Hash ]
│
▼
┌─────────────────────────────────────────┐
│       ⛏️ Mine Block (Proof of Work)      │
│  Increment Nonce -> Compute SHA-256     │
│  Is Hash Prefix == Difficulty Target?   │
└─────────────────────────────────────────┘
│                       │
No                      Yes
│                       │
└───────◄───────────────┴──────────────┐
▼
[ Block Mined & Added to Chain ]
│
▼
[ Validated & Linked to Previous ]
```

---

## 🖥️ Console Output Example

When running the application, the chain generates and mines blocks sequentially:

```text
==================================================
🔨 Mining Block 1...
Block Mined!!! : 0000a3b2f91e4d8120c48e89191632f7a
==================================================
🔨 Mining Block 2...
Block Mined!!! : 00001f3e790ba45129c1110a28f73e911
==================================================

⛓️ BLOCKCHAIN VALIDATION:
Is Blockchain Valid? true
```

## 🧠 What I Learned

Building a blockchain from scratch in Java provided deep insights into cryptographic algorithms and distributed ledger fundamentals:

- 🔐 **Cryptographic Hashing**: Hands-on experience implementing `MessageDigest` with `SHA-256` to enforce data integrity and immutability.
- ⛏️ **Proof-of-Work (PoW) Algorithm**: Learned how mining works under the hood by implementing dynamic difficulty and target hash matching using nonces.
- 🛡️ **Tamper Resistance & Chain Validation**: Discovered how altering a single byte in an earlier block invalidates all subsequent hashes in the chain.
- 🏗️ **Object-Oriented Architecture**: Designed clean Java abstractions for `Block`, `Blockchain`, and utility classes to simulate real-world ledger behavior.
- ⚡ **Performance Factors in Java**: Observed how difficulty level exponentially impacts computational time and CPU resource consumption.
